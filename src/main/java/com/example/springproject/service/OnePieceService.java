package com.example.springproject.service;

import com.example.springproject.model.OnePiece;
import com.example.springproject.repository.OnePieceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Transactional
public class OnePieceService {

    private final OnePieceRepository onePieceRepository;

    public Flux<OnePiece> getAll(){
        return onePieceRepository.findAll();
    }

    public Mono<OnePiece> getById(@PathVariable Long id){
        return onePieceRepository.findById(id);

//        if(character.isEmpty())
//            throw new OnePieceDataNotFoundException("id- "+id);
    }

    public Mono<OnePiece> add(OnePiece onePiece) {
        return onePieceRepository.save(onePiece);
    }

    public Mono<OnePiece> update(Long id,OnePiece onePiece) {
        return onePieceRepository.findById(id)
                .flatMap(dbChar->{
                    dbChar.setName(onePiece.getName());
                    dbChar.setDescription(onePiece.getDescription());
                    dbChar.setFlag(onePiece.getFlag());
                    return onePieceRepository.save(dbChar);
                });
    }

    public Mono<OnePiece> remove(Long id) {
        return onePieceRepository.findById(id)
                .flatMap(dbChar-> onePieceRepository.delete(dbChar)
                        .then(Mono.just(dbChar)));
    }
}
