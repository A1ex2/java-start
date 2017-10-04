package net.ukr.jaroshov;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Создаем массив
		int [][] ourArray = new int[8][8];
		
		// Наполняем массив данными		
		for(int i = 0; i < ourArray.length; i++){
			for(int j = 0; j < ourArray[0].length; j++){
				
				ourArray[i][j]= i + 1;
				
				System.out.print(ourArray[i][j] + " ");
			}
			System.out.println();
		}
		
		// Поворот массива на 90 градусов
		
		int bigger = 1;
		for(int l = 0; l < ourArray[0].length / 2; l++){
			
			for(int k = 0; k < ourArray[0].length; k++){
				int b = k + l;
				int c = ourArray[0].length - 1 - l;
				int d = ourArray[0].length - bigger - k;
				int x = ourArray[l][b];
				
				if (b == (ourArray[0].length - l - 1)) {
					break;
				}	
											
				ourArray[l][b] = ourArray[d][l];
				ourArray[d][l] = ourArray[c][d];
				ourArray[c][d] = ourArray[b][c];
				ourArray[b][c] = x;
			}
			bigger++;
		}
		
		// Выводим массив на экран
		
		System.out.println();
		
		for(int g = 0; g < ourArray.length; g++){
			for(int h = 0; h < ourArray[0].length; h++){
				
								
				System.out.print(ourArray[g][h] + " ");
			}
			System.out.println();
		}
		
		// Поворот массива на 180 градусов
		
		bigger = 1;
		
		for(int l = 0; l < ourArray[0].length / 2; l++){
			
			for(int k = 0; k < ourArray[0].length; k++){
				int b = k + l;
				int c = ourArray[0].length - 1 - l;
				int d = ourArray[0].length - bigger - k;
				int x = ourArray[l][b];
				
				if (b == (ourArray[0].length - l - 1)) {
					break;
				}	
											
				ourArray[l][b] = ourArray[d][l];
				ourArray[d][l] = ourArray[c][d];
				ourArray[c][d] = ourArray[b][c];
				ourArray[b][c] = x;
			}
			bigger++;
		}
		
		System.out.println();
		
		// Выводим массив на экран
		
		for(int g = 0; g < ourArray.length; g++){
			for(int h = 0; h < ourArray[0].length; h++){
				
								
				System.out.print(ourArray[g][h] + " ");
			}
			System.out.println();
		}
		
		// Поворот массива на 270 градусов
		
		bigger = 1;
				
		for(int l = 0; l < ourArray[0].length / 2; l++){
					
			for(int k = 0; k < ourArray[0].length; k++){
				int b = k + l;
				int c = ourArray[0].length - 1 - l;
				int d = ourArray[0].length - bigger - k;
				int x = ourArray[l][b];
						
				if (b == (ourArray[0].length - l - 1)) {
					break;			
				}	
													
				ourArray[l][b] = ourArray[d][l];
				ourArray[d][l] = ourArray[c][d];
				ourArray[c][d] = ourArray[b][c];
				ourArray[b][c] = x;
			}
				bigger++;
		}
				
		System.out.println();
		
		// Выводим массив на экран
		
		for(int g = 0; g < ourArray.length; g++){
			for(int h = 0; h < ourArray[0].length; h++){
							
				System.out.print(ourArray[g][h] + " ");
			}
			System.out.println();
		}
	}
}
