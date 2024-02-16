package com.yasar.entity;

import java.util.Scanner;

public class MallManager {
    // Ana menüyü görüntüler ve kullanıcının farklı işlevler arasında gezinmesini sağlar.
    public void mainMenu() {
        int choice;
        do {
            System.out.println("""
                    **************************************
                    ************   ANA MENU   ************
                    **************************************
                                    
                    1 - Mağaza Ekle
                    2 - Mağazaları Listele
                    3 - Mağaza Güncelle
                    4 - Mağaza Bilgilerini Getir
                    5-  Mağaza İşlemleri Yap
                    0 - <<<  C I K I S  >>>
                                    
                    """);
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz ... : ");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1 -> addStore();
                case 2 -> listStore();
                case 3 -> updateStore();
                case 4 -> storeInfo();
                case 5 -> storeProcess();
                case 0 -> System.out.println("CIKIS YAPTINIZ. IYI GUNLER");
                default -> System.err.println("Hatalı seçim yaptınız. Lütfen tekrar deneyiniz.");

            }
        } while (choice != 0);

        System.err.println("PROGRAM BITTI");

    }

    // Yeni bir mağaza eklemenizi sağlar.
    public void addStore() {
        int storeChoice;
        do {
            System.out.println("""
                    **************************************
                    ***********   MAGAZA EKLE   **********
                    **************************************
                                        
                    1 - Elektronik Mağazası
                    2 - Yiyecek Mağazası
                    3 - Kitap Mağazası
                    4 - Giyim Mağazası
                    0 - <<< ANA MENU >>>
                                        
                    """);
            System.out.print("Lütfen eklemek istediğiniz mağaza türünü seçiniz ... : ");
            storeChoice = new Scanner(System.in).nextInt();
            switch (storeChoice) {
                case 1:
                    Store electronicStore = new ElectronicStore();
                    electronicStore.importData();
                    System.out.println();
                    break;
                case 2:
                    Store foodStore = new FoodStore();
                    foodStore.importData();
                    System.out.println();
                    break;
                case 3:
                    Store bookStore = new BookStore();
                    bookStore.importData();
                    System.out.println();
                    break;
                case 4:
                    Store clothingStore = new ClothingStore();
                    clothingStore.importData();
                    System.out.println();
                    break;
                case 0:
                    System.out.println("""
                            Ana menüye dönülüyor.
                            ---------------------
                                                                    
                            """);
                    break;
                default:
                    System.err.println("Hatalı giriş yaptınız. Lütfen tekrar mağaza seçiniz. ");

            }
        } while (storeChoice != 0);
    }

    // Mağaza listesini görüntüler.
    public void listStore() {
        System.out.println("""
                 **************************************
                 *********   MAGAZA LISTESI   *********
                 **************************************
                """);
        Mall.storeList.forEach(System.out::println);
    }

    // Mağaza bilgilerini güncellemenizi sağlar.
    public void updateStore() {
        int choiceProcess;
        do {
            System.out.println("""
                     **************************************
                     ********   MAGAZA GUNCELLE   *********
                     **************************************
                     
                     1 - Güncelle
                     0 - <<< ANA MENU >>>
                    """);
            System.out.print("Hangi işlemi yapmak istersiniz ... : ");
            choiceProcess = new Scanner(System.in).nextInt();
            switch (choiceProcess) {
                case 1:
                    for (int i = 0; i < Mall.storeList.size(); i++) {
                        System.out.println(i + 1 + " - " + Mall.storeList.get(i).getName());
                    }
                    System.out.print("Lütfen güncelleme yapmak istediğiniz mağazayı seçiniz .... : ");
                    int choiceStore = new Scanner(System.in).nextInt();
                    System.out.println("""
                            1 - İsim
                            2 - Kapı Numarası
                            3 - <<< UST MENU >>>
                            """);
                    System.out.print("Lütfen değiştirmek istediğiniz bilgiyi seçiniz ... : ");
                    int choice = new Scanner(System.in).nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Lütfen yeni adını yazınız ... : ");
                            String newName = new Scanner(System.in).nextLine();
                            Mall.storeList.get(choiceStore - 1).setName(newName);
                            break;
                        case 2:
                            System.out.print("Lütfen yeni kapı numarasını yazınız ... : ");
                            int newFloorNumber = new Scanner(System.in).nextInt();
                            Mall.storeList.get(choiceStore - 1).setFloorNo(newFloorNumber);
                            break;
                        case 3:
                            System.out.println("""
                                    Üst menüye dönülüyor.
                                    ---------------------
                                                                            
                                    """);
                            break;
                        default:
                            System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz.");
                            break;
                    }
                    break;
                case 0:
                    System.out.println("""
                            Ana menüye dönülüyor.
                            ---------------------
                                                                    
                            """);
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz.");
                    break;
            }
        } while (choiceProcess != 0);
    }

    // Belirli bir mağaza hakkında detaylı bilgileri görüntüler.
    public void storeInfo() {
        System.out.println("""
                 **************************************
                 ********   MAGAZA BILGILERI   ********
                 **************************************
                """);
        for (int i = 0; i < Mall.storeList.size(); i++) {
            System.out.println(i + 1 + " - " + Mall.storeList.get(i).getName());
        }
        System.out.print("Lütfen bilgisini görmek istediğiniz mağazayı seçiniz .... : ");
        int choiceStore = new Scanner(System.in).nextInt();
        System.out.println();
        System.out.println(Mall.storeList.get(choiceStore - 1).toString());
    }

    // Seçilen bir mağazada çeşitli işlemleri gerçekleştirmenizi sağlar.
    public void storeProcess() {
        int choiceStore;
        do {
            System.out.println("""
                     **************************************
                     ********   MAGAZA ISLEMLERI   ********
                     **************************************
                     
                    1 - Mağaza Seçimi
                    0 - <<< ANA MENU >>>
                    """);
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz ... : ");
            int choiceProcess = new Scanner(System.in).nextInt();
            System.out.println();
            for (int i = 0; i < Mall.storeList.size(); i++) {
                System.out.println(i + 1 + " - " + Mall.storeList.get(i).getName());
            }
            System.out.println();
            System.out.print("Lütfen işlem yapmak istediğiniz mağazayı seçiniz .... : ");
            choiceStore = new Scanner(System.in).nextInt();
            int storeNo = choiceStore - 1;
            System.out.println();
            switch (choiceProcess) {
                case 1:
                    int choice;
                    do {
                        System.out.println("""
                                **************************************
                                *****   MAGAZA ISLEMLERI MENUSU   ****
                                **************************************
                                                
                                1 - Ürün Alma İşlemleri
                                2 - Ürün Satma İşlemleri
                                3 - Mesai Saati İşlemleri
                                4 - Stok Takibi İşlemleri
                                0 - <<< UST MENU >>>
                                           
                                """);
                        System.out.print("Yapmak istediğiniz işlemi seçiniz ... : ");
                        choice = new Scanner(System.in).nextInt();
                        switch (choice) {
                            case 1:
                                Mall.storeList.get(storeNo).buyProduct();
                                break;
                            case 2:
                                Mall.storeList.get(storeNo).sellProduct();
                                break;
                            case 3:
                                Mall.storeList.get(storeNo).shiftTime();
                                break;
                            case 4:
                                if (!Mall.storeList.get(storeNo).getType().equalsIgnoreCase("foodstore")) {
                                    System.out.println("Stok takibi bulunmamaktadır.");
                                } else {
                                    System.out.println(Mall.storeList.get(storeNo).getName() + "için stok takibi yapıldı.");
                                }
                                break;
                            case 0:
                                System.out.println("""
                                        Üst menüye dönülüyor.
                                        ---------------------
                                                                                
                                        """);
                                break;
                            default:
                                System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz.");
                                break;
                        }
                    } while (choice != 0);
                    break;
                case 0:
                    System.out.println("Ana menüye dönülüyor.");
                    break;
                default:
                    System.err.println("Hatalı seçim yaptınız. Lütfen tekrar deneyiniz.");
                    break;
            }
        } while (choiceStore != 0);
    }
}