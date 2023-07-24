package com.example.demo2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.dto.requestDto.FreeboardAddRequestDto;

import lombok.RequiredArgsConstructor;

@Controller
@RestController
@RequiredArgsConstructor

public class HelloController {
    // @PostMapping("/api/user/signup")
    // public void TEST(@RequestBody @RequestParam() String iang) {
    // System.out.println(iang);
    // // return "test";
    // }

    @PostMapping("/api/free_board/add")
    public void getFreeboard(@RequestBody String iang) {
        System.out.println(iang);

    }

    // @GetMapping("/api/free_board")
    // ic ResponseEntity getFreeboard(@RequestBody long id) {
    // return free_boardService.getFreeboard(id);
    // }

    // @PostMapping("/api/users/signup")
    // public ResponseEntity signup(@RequestBody SignupRequestDto signupRequestDto)
    // {
    // return userService.signup(signupRequestDto);
    // }

    // 팀 메인 게시판
    // @GetMapping("/api/teams/{teamId}")
    // public TeamUserMainResponseDto getMain(@PathVariable Long teamId){
    // return teamService.getMain(teamId);
    // }
}
