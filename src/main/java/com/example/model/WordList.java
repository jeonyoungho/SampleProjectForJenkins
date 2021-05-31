package com.example.model;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Data
public class WordList {
    List<String> list = new ArrayList<>();
}
