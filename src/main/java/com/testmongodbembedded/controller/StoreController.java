package com.testmongodbembedded.controller;

import com.testmongodbembedded.dal.model.User;
import com.testmongodbembedded.dal.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/store")
@RequiredArgsConstructor
public class StoreController {
    private final StoreRepository storeRepository;

    @PostMapping("/new")
    public String placeOrder(@RequestBody User user) {
        storeRepository.save(user);
        return "Order placed successfully!";
    }

    @GetMapping("/findUserByName/{name}")
    public List<User> getUserByName(@PathVariable("name") String name) {
        return storeRepository.findByName(name);
    }

    @GetMapping("/findUserByAddress/{city}")
    public List<User> getUserByAddress(@PathVariable("city") String city) {
        return storeRepository.findByCity(city);
    }
}
