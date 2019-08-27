package com.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	
	private String id; //����id
	private User user; //�����������û� 
	private List<Item> items; //�����а�������Ʒ�б�

}
