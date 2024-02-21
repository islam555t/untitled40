
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

        class Car {
            private String name;
            private Double price;
            private Integer year;

            public Car(String name, Double price, Integer year) {
                this.name = name;
                this.price = price;
                this.year = year;
            }

            public String getName() {
                return name;
            }

            public Double getPrice() {
                return price;
            }

            public Integer getYear() {
                return year;
            }

            @Override
            public String toString() {
                return "Car{" +
                        "name='" + name + '\'' +
                        ", price=" + price +
                        ", year=" + year +
                        '}';
            }
        }

        public class Main {
            public static void main(String[] args) {
                List<Car> carList = new ArrayList<>(10);

                carList.add(new Car("Toyota", 15000.0, 2010));
                carList.add(new Car("Honda", 20000.0, 2015));
                carList.add(new Car("Ford", 18000.0, 2012));
                carList.add(new Car("Chevrolet", 22000.0, 2018));
                carList.add(new Car("BMW", 35000.0, 2020));
                carList.add(new Car("Mercedes", 40000.0, 2019));
                carList.add(new Car("Audi", 30000.0, 2017));
                carList.add(new Car("Lexus", 28000.0, 2016));
                carList.add(new Car("Subaru", 25000.0, 2014));
                carList.add(new Car("Nissan", 17000.0, 2011));

                Scanner scanner = new Scanner(System.in);

                boolean running = true;
                while (running) {
                    System.out.println("Выберите опцию:");
                    System.out.println("1. Отсортировать машины по цене от меньшего к большему");
                    System.out.println("2. Отсортировать машины по цене от большего к меньшему");
                    System.out.println("3. Отсортировать машины по году выпуска от меньшего к большему");
                    System.out.println("4. Отсортировать машины по году выпуска от большего к меньшему");
                    System.out.println("5. Получить рандомную машину");
                    System.out.println("0. Выйти");

                    int option = scanner.nextInt();

                    switch (option) {
                        case 0:
                            running = false;
                            System.out.println("До свидания!");
                            break;
                        case 1:
                            sortByPriceAscending(carList);
                            break;
                        case 2:
                            sortByPriceDescending(carList);
                            break;
                        case 3:
                            sortByYearAscending(carList);
                            break;
                        case 4:
                            sortByYearDescending(carList);
                            break;
                        case 5:
                            printRandomCar(carList);
                            break;
                        default:
                            System.out.println("Неверная опция, выберите снова.");
                    }
                }
            }

            private static void printRandomCar(List<Car> carList) {
            }

            private static void sortByPriceAscending(List<Car> carList) {
                Collections.sort(carList, (c1, c2) -> c1.getPrice().compareTo(c2.getPrice()));
                System.out.println("Отсортированный список по цене от меньшего к большему:");
                printCarList(carList);
            }

            private static void sortByPriceDescending(List<Car> carList) {
                Collections.sort(carList, (c1, c2) -> c2.getPrice().compareTo(c1.getPrice()));
                System.out.println("Отсортированный список по цене от большего к меньшему:");
                printCarList(carList);
            }

            private static void sortByYearAscending(List<Car> carList) {
                Collections.sort(carList, (c1, c2) -> c1.getYear().compareTo(c2.getYear()));
                System.out.println("Отсортированный список по году выпуска от меньшего к большему:");
                printCarList(carList);
            }

            private static void sortByYearDescending(List<Car> carList) {
                Collections.sort(carList, (c1, c2) -> c2.getYear().compareTo(c1.getYear()));
                System.out.println("Отсортированный список по году выпуска от большего к меньшему:");
                printCarList(carList);
            }

            private static void printCarList(List<Car> carList) {
            }
        }
    
