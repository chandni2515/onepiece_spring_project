package com.example.springproject.controller;

import com.example.springproject.model.OnePiece;
import com.example.springproject.service.OnePieceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/onepiece")
public class OnePieceController {

    private final OnePieceService onePieceService;

    @GetMapping("/get")
    public Flux<OnePiece> getAll(){
        return onePieceService.getAll();
    }

    @GetMapping("/{id}")
    public Mono<OnePiece> getById(@PathVariable Long id){
       return onePieceService.getById(id);
    }

    @PostMapping("/add")
    public Mono<OnePiece> addCharacter(@RequestBody OnePiece onePiece){
        return onePieceService.add(onePiece);
    }

    @PutMapping("/update")
    public Mono<OnePiece> updateCharacter(@PathVariable Long id,@RequestBody OnePiece onePiece){
        return onePieceService.update(id,onePiece);
    }

    @DeleteMapping("/delete")
    public Mono<OnePiece> deleteCharacter(@PathVariable Long id){
        return onePieceService.remove(id);
    }

}
