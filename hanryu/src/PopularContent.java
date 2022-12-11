import java.util.HashMap;
import java.util.Map;

class PopularContent {
    //2. 자국 내 한국 컨텐츠 인기도 클래스
    String[] Contents = {"음식", "뷰티", "음악", "패션", "영화", "게임", "드라마", "에니메이션", "예능", "도서", "웹툰"};
    double[] Popularity = {49.4, 48.9, 46.8, 44.7, 41.5, 39.0, 37.8, 35.8, 35.1, 32.5, 31.9};
    Map<String, Double> contentPop = new HashMap<>();

    PopularContent() {
        for (int i = 0; i < 11; i++) {
            contentPop.put(Contents[i], Popularity[i]);
        }
    }

    public void findPopContent(String contentName) {
        Double PopularPercent = contentPop.get(contentName);
        if (PopularPercent == null) {
            System.out.println("해당 컨텐츠가 존재하지 않거나 잘못된 입력입니다.");
        } else {
            System.out.println(contentName + "의 해외 인기도는 " + PopularPercent + "% 입니다.");
        }
    }
}
