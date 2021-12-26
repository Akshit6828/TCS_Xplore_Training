import java.util.*;

public class MedicineSolution {
 public static void main(String[] args) {
  Medicine[] medicine = new Medicine[4];
  String search;

  Scanner sc = new Scanner(System.in);

  for (int i = 0; i < medicine.length; i++) {
   String medicineName = sc.nextLine();
   String batchNo = sc.nextLine();
   String disease = sc.nextLine();
   int price = sc.nextInt();
   sc.nextLine();
   medicine[i] = new Medicine(medicineName, batchNo, disease, price);

  }

  search = sc.nextLine();
  Integer[] price = medicinePriceForGivenDisease(medicine, search);
  
  for(int i=0;i<price.length;i++) {
   System.out.println(price[i]);
  }
  sc.close();
 }

 public static Integer[] medicinePriceForGivenDisease(Medicine[] medicine,String disease)
 {
  //method logic
  //code to find price, sort and return the sorted array.
  Integer [] result = new Integer[0]; // Because the return type is of Integer and Integer[] array is a an array of holding references to Integer Objects.
  for(int i= 0;i < medicine.length; i++){
      if(medicine[i].getDisease().equals(disease)){
          int olderLength = result.length;
          result = Arrays.copyOf(result, olderLength +1 );
          result[olderLength] = medicine[i].getPrice(); 
      }
  }
  Arrays.sort(result);
  return result;
 }


}


class Medicine {
    private
    String medicineName, batchNo , disease; 
    int price;

    // Constructor
    public Medicine(String medicineName, String batchNo, String disease, int price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.disease = disease;
        this.price = price;
    }

    // Generate getter and setter methods
    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getPrice() {
        return price;
    }


    
}
