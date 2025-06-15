package com.devsuperior.order;

import com.devsuperior.order.entities.Order;
import com.devsuperior.order.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class OrderApplication  implements CommandLineRunner {

	private final OrderService orderService;

	public OrderApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {

		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("=== Sistema de Pedidos ===");

		while (true) {
			System.out.print("\nNovo pedido? (s/n): ");
			String opcao = sc.nextLine().trim().toLowerCase();

			if (opcao.equals("n")) {
				System.out.println("Encerrando o sistema.");
				break;
			}

			System.out.print("Código: ");
			Integer codigo = Integer.valueOf(sc.nextLine());

			System.out.print("Valor básico: ");
			Double basicValue = Double.valueOf(sc.nextLine());

			System.out.print("Porcentagem de desconto: ");
			Double discount = Double.valueOf(sc.nextLine());

			Order order = new Order(codigo, basicValue, discount);
			double total = this.orderService.total(order);

			System.out.printf("Total do pedido: %.2f%n", total);
		}

		sc.close();
	}

}
