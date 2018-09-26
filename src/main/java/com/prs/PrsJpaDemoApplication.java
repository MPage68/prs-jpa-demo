package com.prs;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prs.business.User;
import com.prs.business.UserDB;
import com.prs.util.Console;

@SpringBootApplication
public class PrsJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrsJpaDemoApplication.class, args);
		System.out.println("Welcome to Thunderdome!");
		String command = "";
		while (!command.equals("9")) {
			displayMenu();
			command = Console.getString("Enter selection: ");
					
			if (command.equals("1")) {
				List<User> users = UserDB.list();
				System.out.println("List of users: ");
				
				for (User u : users) {
					System.out.println(u);
				}
			} else {
				System.out.println("Invalid command. Try again");

			}
		}
		System.out.println("bye, nice to know ya.");
	}

	private static void displayMenu() {
		StringBuilder sb = new StringBuilder("command Menu:\n");
		sb.append("1 - List:\n");
		sb.append("9 - Exit:\n");
		System.out.println(sb);

	}
}
