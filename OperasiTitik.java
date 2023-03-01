/**
 * OperasiTitik.java 2023
 * Penulis : Asprak Lab D
 * Deskripsi : kelas yang berisi berbagai operasi terhadap objek Titik.
 * 
 */ 
 
 public class OperasiTitik{
	 
	 public void refleksiSumbuX(Titik titik){
		//titik.ordinat = titik.ordinat * -1;
		double x;
		x = titik.getOrdinat();
		x *= -1; // x = x*-1
		titik.setOrdinat(x);
	 }
	 
	 public void refleksiSumbuY(Titik titik){
		//titik.absis = titik.absis * -1;
		double y;
		y = titik.getAbsis();
		y *= -1;
		titik.setAbsis(y);
	 }
 }
 