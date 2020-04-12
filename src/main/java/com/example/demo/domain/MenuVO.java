package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

/**
 * 〈〉<br>
 *
 * @author lilonghua
 * @create 2020/4/12
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@Table(name = "menu")
public class MenuVO {
    private Long id;
    private String href;
}