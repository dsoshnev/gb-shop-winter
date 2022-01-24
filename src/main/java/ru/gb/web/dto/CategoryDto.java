package ru.gb.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryDto {
    @JsonProperty(value = "id")
    private Long categoryId;
    private String title;
    private int version;
    //private List<ProductDto> products;
}
