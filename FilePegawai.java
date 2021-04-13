package PEGAWAI;

public class FilePegawai {

    public static void main(String[] args) {
        Pegawai first = new Pegawai ("Susan Meyers",47899,"Accounting","Vice President");
        Pegawai second = new Pegawai ("Mark Jones",39119,"IT","Programmer");
        Pegawai third = new Pegawai ("Joy Rogers",81774, "Manufacturing","Engineer");
        System.out.println(" "+first.getName()+ ", "+first.getIdNumber()+ ". "+first.getDerpartement()+ ", "+first.getPosition());
        System.out.println(" "+second.getName()+ ", "+second.getIdNumber()+ ", "+second.getDerpartement()+ ", "+second.getPosition());
        System.out.println(" "+third.getName()+ ", "+third.getIdNumber()+ ", "+third.getDerpartement()+ ", "+third.getPosition());
    }
    
}
