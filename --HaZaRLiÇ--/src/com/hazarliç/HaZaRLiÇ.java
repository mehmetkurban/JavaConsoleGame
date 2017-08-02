package com.hazarliç;
import java.util.Scanner;
import java.util.Random;

public class HaZaRLiÇ{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		DeyiskenSetGet mySkoor=new DeyiskenSetGet();	
		String dizia[]=new String[2]; 
		int dizib[]=new int[2];
		int dizix[]=new int[2];
		int diziy[]=new int[2];
			while(mySkoor.getMenu()!="4"){
				System.out.println("\n\t\t\t\t\t\t\t      --HaZarLiÇ (Version 00.1)'e Hoşgeldiniz.--\n"
									+"\n\t\t\t\t\t\t\t\t      --Kurallar için 1'e-- "
									+"\n\t\t\t\t\t\t\t\t      --Skor Tabelası için 2'ye-- "
									+"\n\t\t\t\t\t\t\t\t      --İki Oyunculu Oynamak için 3'e-- "
									+"\n\t\t\t\t\t\t\t\t      --Çıkış için 4'e BASINIZ.--");
				mySkoor.setMenu(input.nextLine());
				int a=0,b=0,c=0,d=0;
					switch(mySkoor.getMenu()){
						case "1":
							System.out.println("\n\n\t\t\t\t\t\t--HaZarliç Bir Zar Oyunudur.\n\n"
												+"\t\t\t\t\t\t--5 El ve 2 Tur'dan Oluşmaktadır.\n\n"
												+"\t\t\t\t\t\t--Her Tur Atılan Zarlar Toplanıp Skora Eklenir.\n\n"
												+"\t\t\t\t\t\t--2 Tur Sonunda Skorlar Toplanıp Toplam Skora Eklenir.\n\n"
												+"\t\t\t\t\t\t--Toplam Skoru Büyük Olanın Genel Skorua +1 Puan Eklenir ve 2.Ele Geçilir.\n\n"
												+"\t\t\t\t\t\t--Genel Skorunu +3 Yapan HaZarLiç'i KAZANIR.\n\n"
												+"\t\t\t\t\t\t--Atılan Zarlarda Gelebileçek Değerler = {-6,-5,-4,-3,-2,-1,1,2,3,4,5,6}'dır.\n\n"
												+"\t\t\t\t\t\t--Yani Bunlar Pozitif ve Negatif Zarlardır.\n\n"
												+"\t\t\t\t\t\t--Süper Zar Seçeneği İle Zarlarınızı Pozitif Yapabilirsiniz.\n\n"
												+"\t\t\t\t\t\t--Bütün Oyun Boyunca Yalnız 2 Adet Süper Zar Hakkınız Vardır ve Her El 1 Kere Kullanabilirsiniz.\n\n"
												+"\t\t\t\t\t\t--Süper Zarı s'ye 2 Kere Basarak(ss) Atabilirsiniz.\n\n"
												+"\t\t\t\t\t\t--Normal Zar Atımı İçin Herhangi Bir Tuşa Basabilirsiniz.\n\n"
												+"\t\t\t\t\t\t--İyi Eğlenceler.HaZarLiç(Version 00.1)\n\n");
							
						break;
						case "2":
							System.out.println(dizia[a] +dizib[b]+ "ile HaZarLiÇ'i Kazanmıştır.");
							
							
						break;
						case "3":
							Scanner al=new Scanner(System.in);
							Random Rand=new Random();
							DeyiskenSetGet mySkor=new DeyiskenSetGet();
								
								int toplamskor1=0,toplamskor2=0,genelskor1=0,genelskor2=0,dizi1[]={-6,-5,-4,-3,-2,-1,1,2,3,4,5,6},tur1=1,tur2=1; String salla,salla2;
									
									System.out.println("\n\t\t\t\t\t\t    !!! Unutmayın Zarları Herhangi Bir Tuşa Basarak Atmalısınız !!!\n"
														+"\n\t\t\t\t\t\t\t\t\t       !!! Ve !!!\n\n"
														+"\t\t\t\t\t\t         !!! Süper Zarı Atmak İçin s'ye 2 Kere Basmalısınız !!!\n");
									
									System.out.println("\t\t\t\t\t\t\t\t\t1.Oyuncunun İsmini Giriniz.");
									mySkor.setOyuncu1(al.nextLine());	
									System.out.println("\t\t\t\t\t\t\t\t\t2.Oyuncunun İsmini Giriniz.");
									mySkor.setOyuncu2(al.nextLine());
									
									for(int j=1;j<6;j++){
										tur1=1; tur2=1;
										for(int ii=1; ii<3;ii++){
												for(int m=167;m>0;m--){
													System.out.print("*");
												}
												System.out.println("\n\t\t\t\t\t\t\t\t\t\t  "+j+".EL");
												System.out.println("\t\t\t\t\t\t\t\t\t\t  "+ii+".TUR");
												for(int h=167;h>0;h--){
													System.out.print("*");
												}
													System.out.println("\n\t\t\t\t\t1.Oyuncu *** "+mySkor.getOyuncu1()+" ***");
													System.out.println("\t\t\t\t\tSüper Zar= "+mySkor.getSuperzar1());
													salla=al.nextLine();
														{switch(salla){	
														
																case "ss":
																	if(tur1==1){
																		if(mySkor.getSuperzar1()>0){
																			mySkor.setZar1(Rand.nextInt(6)+1);
																			mySkor.setZar2(Rand.nextInt(6)+1);
																			mySkor.setSuperzar1(mySkor.getSuperzar1()-1);
																			tur1=0;
																		}else{
																			System.out.println("\t\t\t\t\t!!! Süper Zar Hakkınız Bitmiştir !!!\n");
																			mySkor.setZar1((dizi1[Rand.nextInt(12)]));
																			mySkor.setZar2((dizi1[Rand.nextInt(12)]));
																		}
																	}else{
																			if(mySkor.getSuperzar1()==0){
																				System.out.println("\t\t\t\t\t!!! Süper Zar Hakkınız Bitmiştir !!!\n");
																				mySkor.setZar1((dizi1[Rand.nextInt(12)]));
																				mySkor.setZar2((dizi1[Rand.nextInt(12)]));
																			}else{
																				System.out.println("\t\t\t\t\t!!! 1.Tur Süper Zar Hakkınızı Kullandınız!!!\n");
																				mySkor.setZar1((dizi1[Rand.nextInt(12)]));
																				mySkor.setZar2((dizi1[Rand.nextInt(12)]));
																			}	
																	}	
																break;
																case "s":
																mySkor.setZar1((dizi1[Rand.nextInt(12)]));
																mySkor.setZar2((dizi1[Rand.nextInt(12)]));
																break;
														}
													System.out.println("\t\t\t\t\t1.Zar="+mySkor.getZar1());
													System.out.println("\t\t\t\t\t2.Zar="+mySkor.getZar2()+"\n");
														mySkor.setOyuncu1skor(mySkor.getZar1()+mySkor.getZar2());
														System.out.println("\t\t\t\t\tSkor="+mySkor.getOyuncu1skor());
														toplamskor1+=mySkor.getOyuncu1skor();
														System.out.println("\t\t\t\t\tToplamSkor="+toplamskor1);
														System.out.println("\t\t\t\t\tGenelSkor="+genelskor1+"\n");
												}		
														
													System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t2.Oyuncu *** "+mySkor.getOyuncu2()+" ***");			
													System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tSüper Zar= "+mySkor.getSuperzar2());
														salla2=al.nextLine();
														switch(salla2){	
														
														case "ss":
															if(tur2==1){
																if(mySkor.getSuperzar2()>0){
																	mySkor.setZar1(Rand.nextInt(6)+1);
																	mySkor.setZar2(Rand.nextInt(6)+1);
																	mySkor.setSuperzar2(mySkor.getSuperzar2()-1);
																	tur2=0;
																}else{
																	System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t!!! Süper Zar Hakkınız Bitmiştir !!!\n");
																	mySkor.setZar1((dizi1[Rand.nextInt(12)]));
																	mySkor.setZar2((dizi1[Rand.nextInt(12)]));
																}
															}else{
																	if(mySkor.getSuperzar2()==0){
																		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t!!! Süper Zar Hakkınız Bitmiştir !!!\n");
																		mySkor.setZar1((dizi1[Rand.nextInt(12)]));
																		mySkor.setZar2((dizi1[Rand.nextInt(12)]));
																	}else{
																		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t!!! 1.Tur Süper Zar Hakkınızı Kullandınız!!!\n");
																		mySkor.setZar1((dizi1[Rand.nextInt(12)]));
																		mySkor.setZar2((dizi1[Rand.nextInt(12)]));
																	}	
															}	
														break;
														case "s":
														mySkor.setZar1((dizi1[Rand.nextInt(12)]));
														mySkor.setZar2((dizi1[Rand.nextInt(12)]));
														break;
												}
													System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t1.Zar="+mySkor.getZar1());
													System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t2.Zar="+mySkor.getZar2());
														mySkor.setOyuncu2skor(mySkor.getZar1()+mySkor.getZar2());
														System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tSkor="+mySkor.getOyuncu2skor());
														toplamskor2+=mySkor.getOyuncu2skor();
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tToplamSkor="+toplamskor2);
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tGenelSkor="+genelskor2+"\n");
														
										}
										if(toplamskor1>toplamskor2){
												System.out.println("\n\t\t\t\t\t\t\t*****Bu elin galibi***** -->  $$$ "+mySkor.getOyuncu1()+" $$$");
												genelskor1+=1;
												System.out.println("\t\t\t\t\t\t\t *****Genel Skorun*****  -->   \t   >>> "+genelskor1+" <<<\n");
												toplamskor1=0;
												toplamskor2=0;
										}else{
												System.out.println("\n\t\t\t\t\t\t\t*****Bu elin galibi***** -->  $$$ "+mySkor.getOyuncu2()+" $$$");
												genelskor2+=1;
												System.out.println("\t\t\t\t\t\t\t *****Genel Skorun*****  -->   \t   >>> "+genelskor2+" <<<\n");
												toplamskor1=0;
												toplamskor2=0;
										}	
										for(int h=167;h>0;h--){
											System.out.print("*");
										}
										System.out.println("\n");
								if(genelskor1==3 || genelskor2==3){
													
													if(genelskor1>genelskor2){
														time3();
														for(int x=5;x>0;x--){
															for(int y=167;y>0;y--){
																System.out.print(+x);
															}
															System.out.println("\n");
															time1();
														}
														for(int p=0;p<100;p++){
														System.out.println("************************************************************ $$$ HaZarLiçi Kazanan : $$$ "+mySkor.getOyuncu1()+" $$$ ************************************************************");
														}
														time5();
														dizia[a]=mySkor.getOyuncu1();  diziy[c]=j; 
														a++; c++; 
														break;
													}else{
														time3();
														for(int x=5;x>0;x--){
															for(int y=167;y>0;y--){
																System.out.print(+x);
															}
															System.out.println("\n");
															time1();
														}
														for(int w=0;w<100;w++){
														System.out.println("************************************************************ $$$ HaZarLiçi Kazanan : $$$ "+mySkor.getOyuncu2()+" $$$ ************************************************************");
														}
														time5();
														
														dizia[a]=mySkor.getOyuncu2(); dizib[b]=toplamskor2;
														a++;b++;
														break;
													}
								}else{
									
								}	
						}
									
									
									
						break;
						case"4":
							
						System.exit(0);
							
						break;
					default:
							System.out.println("\n\t\t\t\t\t\t\t     !!! Yanlış Seçim Yaptınız Tekrar Deneyin !!!\n");
						break;
					
				}	
			
			}
	}	
	public static void time5(){
		try{
			Thread.sleep(5000);
		}catch(Exception e){
			
		}
	
	}
	
	public static void time3(){
		try{
			Thread.sleep(3000);
		}catch(Exception e){
			
		}
	
	}
	
	public static void time1(){
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			
		}
	
	}
}