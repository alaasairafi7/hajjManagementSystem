package ALRAHMA1.company;

public class Camp_B extends Camp{
    int Numofbed=60;
    int Numofcamps=6;
    //overruds
    public void servicesOfCamp(){
        System.out.println("");
        System.out.println("1-We offer free transportation to the Holy Mosque and the holy sites around the clock\n" +
                "١- يقدم خدمه النقل الى المسجد الحرام والمشاعر المقدسة مجانا على مدار الساعه");
        System.out.println("2- Providing a religious guide for help and guidance" +
                "\n ٢- توفير مرشد ديني للمساعدة والارشاد");
        System.out.println("3- Distribution of refrigerators for water bottles" +
                "\n٣-توزيع البرادات الخاصة بعبوات المياه");
        System.out.println("4- we provide protection and safety for any issues " +
                "\n٤-نحن نقدم الحماية والأمان لأي مشاكل");
        System.out.println("5- First aid and paramedic services around the clock are provided Providing masks and sterilizers to prevent viruses" +
                "\n٥-يتم تقديم خدمات الإسعافات الأولية والمسعفين وتوزيع الأقنعة والمعقمات على مدار الساعة");
        System.out.println("6- we provide a safekeeping service" + "\n ٦-خدمة حفظ الامانات");
        System.out.println("7-We provide nutritional programs\n" +
                "٧- البرامج الغذائية");
        System.out.println("Provide an limited WIFI \n" +
                "انترنت محدود");
    }

    public void Location(){
        System.out.println("Camp A is located in the middle of Mina near Jamarat, about 1 km away");
        System.out.println("يقع مخيم A في منتصف منى قريب من الجمرات بمسافة١   كم  ");
    }

    public  void description(){
        System.out.println("We have spacious camps with an area of 30 m, and we provide each person with a single bed, a pillow and a blanket\n" +
                "Dedicated toilets for each camp, free food services, as well as TV,");
        System.out.println("لدينا مخيمات واسعة بمساحة ٣٠م، ونوفر لكل حاج سرير منفرد ووسادة وبطانية\n" +
                "ودورات مياه مخصصة لكل مخيم، وخدمات طعام مجانية، بالإضافة الى تلفاز\n" +
                "و مكبرات صوت لتنبيهك عند دخول الصلاة\n");
    }


    @Override
    public String toString() {
        return "Your reservation in camp B in bed"+Numofbed--;
    }
}