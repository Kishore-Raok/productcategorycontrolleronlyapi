package dev.kishore.productcategorycontrolleronlyapi.dtos;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class productDTO {

    private Long id;
    private String title;
    private String description;
    private double price;
    private String image;
    private String category;

}
