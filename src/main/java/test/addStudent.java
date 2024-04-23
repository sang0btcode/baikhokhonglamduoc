package test;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Util.hibernateUtil;
import abc.Student;

public class addStudent {
	public static void main(String[] args) {
		try {

			SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
			Scanner sc = new Scanner(System.in);
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();

				Transaction tr = session.beginTransaction();
				Student st = new Student();
				System.out.println("Nhập tên:");
				st.setName(sc.nextLine());
				System.out.println("Nhập giới tính (nam: true || nữ: fale)");
				st.setSex(sc.nextBoolean());
				System.out.println("Nhập tuổi");
				st.setAge(sc.nextInt());
				sc.nextLine();
				System.out.println("Quê quán: ");
				st.setAddress(sc.nextLine());
				System.out.println(st);
				session.save(st);
				tr.commit();

			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
