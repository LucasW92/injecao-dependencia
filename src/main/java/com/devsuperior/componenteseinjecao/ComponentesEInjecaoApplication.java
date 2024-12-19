package com.devsuperior.componenteseinjecao;

import com.devsuperior.componenteseinjecao.entities.Order;
import com.devsuperior.componenteseinjecao.service.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class ComponentesEInjecaoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ComponentesEInjecaoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite com o código do pedido: ");
        int orderCode = sc.nextInt();
        System.out.print("Digite o valor básico do pedido: ");
        double basicValue = sc.nextDouble();
        System.out.print("Digite o percentual de desconto do pedido: ");
        double discount = sc.nextDouble();

        Order order = new Order(orderCode, basicValue, discount);
        OrderService orderService = new OrderService();

        System.out.printf("Pedido código %s \n", order.getCode());
        System.out.printf("Valor total: R$ %.2f",  orderService.total(order));

        sc.close();
    }
}
