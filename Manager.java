package javaClass.Bai4;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Manager {
    private static ArrayList<CongNhan> listOne = new ArrayList<>();
    private static ArrayList<KySu> listTwo = new ArrayList<>();
    private static ArrayList<NhanVien> listThree = new ArrayList<>();
    public Manager(){
        listOne.add(new CongNhan("Thom",18,"Nam","Quang Tri",1));
        listTwo.add(new KySu("Khanh",18,"Nam","Quang Binh","Dao Tao Lai Xe"));
        listThree.add(new NhanVien("Minh",18,"Nu","Quang Ninh","Van Chuyen"));
    }
    public static void menu(){
        System.out.println("1. Input\n2. Search by Name\n3. Printf\n4. Exit");
    }
    public void inputCongNhan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên :");
        String name = sc.next();
        System.out.println("Input tuổi :");
        int age = sc.nextInt();
        System.out.println("Input gender :");
        String gender = sc.next();
        System.out.println("Input Street :");
        String street = sc.next();
        System.out.println("Input Level :");
        int level = sc.nextInt();
        CongNhan o = new CongNhan(name,age,gender,street,level);
        listOne.add(o);
    }
    public void inputKySu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên :");
        String name = sc.next();
        System.out.println("Input tuổi :");
        int age = sc.nextInt();
        System.out.println("Input gender :");
        String gender = sc.next();
        System.out.println("Input Street :");
        String street = sc.next();
        System.out.println("Input TrainingIndustry :");
        String trainingIndustry = sc.next();
        KySu on = new KySu(name,age,gender,street,trainingIndustry);
        listTwo.add(on);
    }
    public void inputNhanVien(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên :");
        String name = sc.next();
        System.out.println("Input tuổi :");
        int age = sc.nextInt();
        System.out.println("Input gender :");
        String gender = sc.next();
        System.out.println("Input Street :");
        String street = sc.next();
        System.out.println("Input Level :");
        String level = sc.next();
        NhanVien o = new NhanVien(name,age,gender,street,level);
        listThree.add(o);
    }
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner sc = new Scanner(System.in);
        menu();
        while (true){
            System.out.println("Nhập :");
            int chon = sc.nextInt();
            switch (chon){
                case 1:
                    System.out.println("Thêm :\n1. Cong Nhan\n2.Ky Su\n3.Nhan Vien");
                    int chonadd = sc.nextInt();
                    if (chonadd == 1){
                        manager.inputCongNhan();
                    } else if (chonadd == 2) {
                        manager.inputKySu();
                    } else if (chonadd == 3) {
                        manager.inputNhanVien();
                    } else {
                        System.out.println("Nhập Sai");
                    }
                    menu();
                    break;
                case 3:
                    System.out.println("Printf CongNhan");
                    for (CongNhan c : listOne) {
                        System.out.println(c.toString());
                    }
                    System.out.println("Printf KySu");
                    for (KySu k : listTwo) {
                        System.out.println(k.toString());
                    }
                    System.out.println("Printf NhanVien");
                    for (NhanVien nhanVien: listThree) {
                        System.out.println(nhanVien.toString());
                    }
                    menu();
                    break;
                case 2:
                    System.out.println("Search :\n1. Cong Nhan\n2.Ky Su\n3.Nhan Vien");
                    int chonaddd = sc.nextInt();
                    System.out.println("Nhập tên cần tìm :");
                    String nameSearch = sc.next();
                    if (chonaddd == 1){
                        for (CongNhan congNhan : listOne) {
                            if (Objects.equals(congNhan.getname(),nameSearch)){
                                System.out.println(congNhan.toString());
                            }
                        }
                    } else if (chonaddd == 2) {
                        for (KySu kySu : listTwo) {
                            if (Objects.equals(kySu.getname(),nameSearch)){
                                System.out.println(kySu.toString());
                            }
                        }
                    } else if (chonaddd == 3) {
                        for (NhanVien nhanVien : listThree) {
                            if (Objects.equals(nhanVien.getname(),nameSearch)){
                                System.out.println(nhanVien.toString());
                            }
                        }
                    } else {
                        System.out.println("Nhập Sai");
                    }
                    menu();
                    break;
                case 4:
                    menu();
                    break;
            }
        }
    }
}
