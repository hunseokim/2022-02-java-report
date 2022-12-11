import java.io.File;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);   //스캐너
        KoreaImage ki = new KoreaImage();   //한국 연상 이미지 클래스
        PopularContent pc = new PopularContent();   //인기도 클래스
        Details cd = new Details(); //컨텐츠 상세정보
        boolean runCheck= true;
        System.out.println("안녕하세요 해외 한류 정보 입니다.");
        while (runCheck) {
            System.out.println("=============================");
            System.out.println("원하시는 정보의 번호를 입력해주세요.");
            System.out.println("1. 연도별 한국 연상 이미지\n2. 자국 내 한국 컨텐츠 인기도\n3. 컨텐츠 상세정보\n4. 컨텐츠 소비 주요 국가\n5. 2021 한류 소식\n그 외. 종료");
            int menuInput = scanner.nextInt();
            scanner.nextLine();
            switch (menuInput){
                case 1:
                    //연도별 한국 연상이미지
                    System.out.print("검색하고 싶은 연도를 입력해주세요(2014~2021): ");
                    int yearSearch = scanner.nextInt();
                    scanner.nextLine();
                    try {
                        ki.yearSet(yearSearch);
                        ki.rankShow();
                    } catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("2014년과 2021년 사이에서만 검색할 수 있습니다.");
                    }
                    break;
                case 2:
                    //자국내 한국 컨텐츠 인기도
                    System.out.println("검색하고싶은 컨텐츠를 입력해주세요.");
                    System.out.println("컨텐츠 목록: 음식, 뷰티, 음악, 패션, 영화, 게임, 드라마, 에니메이션, 예능, 도서, 웹툰");
                    String popSearch=scanner.nextLine();
                    pc.findPopContent(popSearch);
                    break;
                case 3:
                    //컨텐츠 상세정보
                    System.out.println("검색하고싶은 컨텐츠를 입력해주세요.");
                    System.out.println("컨텐츠 목록: 음악, 영화, 게임, 드라마");
                    String detailSearch=scanner.nextLine();
                    cd.setClass(detailSearch);
                    break;
                case 4:
                    //컨텐츠 주요 소비 국가
                    System.out.println("검색하고싶은 컨텐츠를 입력해주세요.");
                    System.out.println("컨텐츠 목록: 음악, 영화, 게임, 드라마");
                    String countrySearch=scanner.nextLine();
                    try {
                        ContentCountry cc = ContentCountry.valueOf(countrySearch);
                        System.out.println(cc.name() + " 컨텐츠의 소비비중이 많은 국가는 " + cc.getCountryName() + "이(가) 있습니다.");
                    }
                    catch (IllegalArgumentException e){
                        System.out.println("검색 가능한 컨텐츠가 아닙니다");
                    }
                    break;
                case 5:
                    //2021 한류소식
                    System.out.println("검색하고싶은 달을 영어로 입력하세요.");
                    System.out.print("검색 가능한 달:");
                    KNews[] month=KNews.values();
                    for (KNews monthList:month){
                        System.out.print(monthList+" ");
                    }
                    System.out.print("\n");
                    String monthSearch=scanner.nextLine();
                    try {
                    KNews kn = KNews.valueOf(monthSearch);
                    String newsString=kn.getNews();
                    File file =new File("c:/JavaTemp/"+kn.name()+".txt");
                    if (file.exists()==false){file.createNewFile();}
                    FileWriter fw =new FileWriter("c:/JavaTemp/"+kn.name()+".txt");
                    fw.write(newsString);
                    fw.close();
                    System.out.println("해당달의 소식 파일을 작성하였습니다.");
                    }
                    catch (IOException e) {
                        System.out.println("해당 달의 소식이 없습니다.");
                    }
                    break;
                default:
                    //종료
                    runCheck=false;
                    System.out.println("서비스를 종료합니다.");
                    break;
            }
        }
    }
}