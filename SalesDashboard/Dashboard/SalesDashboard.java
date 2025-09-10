package Dashboard;


import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

public class SalesDashboard {
    public static void main(String[] args) {
    
        Item tv = new Item("Smart TV","Electronics",800);
        Item phone = new Item("Phone","Electronics",600);
        Item toaster = new Item("Toaster","Home Appliances",50);
        Item blender = new Item("Blender","Home Appliances",40);
        Item dumbbell = new Item("Dumbbell","Fitness",70);

        Order o1 = new Order(LocalDate.now().minusDays(10), List.of(tv, toaster));
        Order o2 = new Order(LocalDate.now().minusDays(20), List.of(phone, blender));
        Order o3 = new Order(LocalDate.now().minusDays(30), List.of(dumbbell));

        Map<String,List<Order>> store1 = new HashMap<>();
        store1.put("Alice", List.of(o1,o2,o3)); 

        Map<String,List<Map<String,List<Order>>>> cityToStoresMap = new HashMap<>();
        cityToStoresMap.put("New York", List.of(store1));

        
        LocalDate cutoff = LocalDate.now().minusDays(60);

        List<Item> picks = cityToStoresMap.values().stream()
            .flatMap(List::stream)                         
            .flatMap(store -> store.entrySet().stream())   
            .filter(e -> e.getValue().stream()
                         .filter(o -> o.getDate().isAfter(cutoff)).count() >= 3)
            .flatMap(e -> e.getValue().stream()
                         .flatMap(o -> o.getItems().stream()))
            .distinct()
            .sorted(Comparator.comparingDouble(Item::getPrice).reversed())
            .peek(i -> System.out.println("Item: "+i.getName()+" Rs-"+i.getPrice()))
            .skip(2).limit(10) 
            .toList();

        
        Map<String,List<Item>> grouped = picks.stream()
            .collect(Collectors.groupingBy(Item::getCategory));

        
        long electronicsCount = grouped.getOrDefault("Electronics", List.of()).size();
        boolean anyAbove500 = picks.stream().anyMatch(i -> i.getPrice()>500);
        boolean allAbove10 = picks.stream().allMatch(i -> i.getPrice()>10);
        boolean noneEmptyName = picks.stream().noneMatch(i -> i.getName()==null || i.getName().isEmpty());
        Optional<Item> firstHome = grouped.getOrDefault("Home Appliances", List.of()).stream().findFirst();
        Optional<Item> anyFitness = grouped.getOrDefault("Fitness", List.of()).stream().findAny();
        double totalValue = picks.stream().map(Item::getPrice).reduce(0.0, Double::sum);

        
        System.out.println("\nGrouped by category: " + grouped);
        System.out.println("Electronics count: " + electronicsCount);
        System.out.println("Any above $500? " + anyAbove500);
        System.out.println("All above $10? " + allAbove10);
        System.out.println("No empty names? " + noneEmptyName);
        System.out.println("First Home Appliance: " + firstHome);
        System.out.println("Any Fitness item: " + anyFitness);
        System.out.println("Total value: " + totalValue);
    }
}
