package day38_Statics.ScrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

        Developer developer1 = new Developer();
        Developer developer2 = new Developer();
        Developer developer3 = new Developer();
        Developer developer4 = new Developer();

        developer1.setInfo("Bektemir", "K-01", "Full stack Developer", "Amazon", 160000, 'M');
        developer2.setInfo("Nikola", "Y-821", "Software Developer", "Windows", 155000, 'M');
        developer3.setInfo("Meredith", "T-234", "Full stack Developer", "Apple", 140000, 'F');
        developer4.setInfo("Ian", "L-02", "Developer", "CVS Pharmacy", 135000, 'M');


        Tester tester1 = new Tester();
        Tester tester2 = new Tester();
        Tester tester3 = new Tester();
        tester1.setInfo("Adnan","0005","Tester","Cybertek",98000,'M');
        tester2.setInfo("Dean","0006","Tester","Cybertek",98500,'M');
        tester3.setInfo("Jair","0007","Tester","Cybertek",99000,'M');



    }

}