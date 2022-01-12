package com.th.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.th.dto.UserCartDTO;
import com.th.model.Book;
import com.th.model.UserCart;
import com.th.repository.BookRepository;
import com.th.repository.UserCartRepository;
import com.th.util.ImageUtil;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	UserCartRepository userCartRepository;

	@Autowired
	BookRepository bookRepository;

	@Override
	public String addBookToCart(UserCart userCart) {

		UserCart userCartFetchId = userCartRepository.findByUseremailAndBookid(userCart.getUseremail(), userCart.getBookid());
		
		
		UserCart cartExists = new UserCart();
		cartExists.setBookid(userCart.getBookid());
		if(userCartFetchId!=null)
		cartExists.setCartid(userCartFetchId.getCartid());
		cartExists.setQuantity(userCart.getQuantity());
		cartExists.setUseremail(userCart.getUseremail());
		System.out.println(userCart.getCartid());
		
		userCartRepository.save(cartExists);

		return "success";
	}

	@Override
	public String getAllOrders(String useremail, Model model) {

		List<UserCart> cartList = userCartRepository.findByUseremail(useremail);
		List<Book> books = new ArrayList<>();

		if (!cartList.isEmpty()) {

			cartList.forEach(cartItem -> books.add(bookRepository.findById(cartItem.getBookid()).get()));

			List<UserCartDTO> userCartDTOList = new ArrayList<>();

			books.forEach(bookItem -> {

				UserCartDTO userCartDTO = new UserCartDTO();

				userCartDTO.setBook(bookItem);
				userCartDTO.setQuantity(userCartRepository.findById(getCartId(cartList, bookItem.getidbook(), useremail)

				).get().getQuantity());

				userCartDTOList.add(userCartDTO);

			});

			model.addAttribute("cartList", userCartDTOList);
			model.addAttribute("imgUtil", new ImageUtil());

			return "cart";
		} else {
			return "redirect:users";
		}

	}

	private Integer getCartId(List<UserCart> cartList, int bookid, String useremail) {
		for (UserCart userCart : cartList) {
			if (userCart.getBookid() == bookid && userCart.getUseremail().equals(useremail)) {
				return userCart.getCartid();
			}
		}
		return null;
	}

}
