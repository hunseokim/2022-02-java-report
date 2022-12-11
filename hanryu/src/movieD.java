class movieD implements ContentDetails {
    //3-상세정보 영화
    @Override
    public void percentDetail() {
        System.out.println("영화 컨텐츠의 1년 내내 이용률은 88.9% 입니다.");
    }

    @Override
    public void countryDetail() {
        System.out.println("영화 컨텐츠의 호감도가 높은 국가는 태국, 아르헨티나, 인도가 있습니다.");
    }

    @Override
    public void reasonDetail() {
        System.out.println("영화 컨텐츠를 선호하는 이유는 스토리와 배우라고 합니다.");
    }

    @Override
    public void favoriteDetail() {
        System.out.println("선호하는 영화에는 기생충, 부산행이 뽑혔습니다.");
    }
}
