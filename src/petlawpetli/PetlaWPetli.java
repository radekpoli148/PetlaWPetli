/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package petlawpetli;

public class PetlaWPetli {

    public static void main(String[] args) {
        
        for(int j =1; j <=10; j++)
        {
            if(j % 2 != 0)
                continue;
            
            for(int i = 1; i <= 10; i++)
            {
                System.out.print(i * j+" ");
            }
            System.out.println();
        }
        
        for(int i = 0; i < 10; i++)
        {
            if(i % 2 == 0)
                continue; //przerwanie iteracji od tego momenu i nie wykonuj instrukcji
            
            if(i == 7)
                break; //przerwanie iteracji i zakończenie pętli
            
            System.out.println(i);
        }
    }
    
}
