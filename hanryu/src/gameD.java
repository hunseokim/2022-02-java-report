class gameD implements ContentDetails {
    //3-상세정보 게임
    @Override
    public void percentDetail() {
        System.out.println("게임 컨텐츠의 1년 내내 이용률은 81.2% 입니다.");
    }

    @Override
    public void countryDetail() {
        System.out.println("게임 컨텐츠의 호감도가 높은 국가는 아르헨티나, 인도, 태국이 있습니다.");
    }

    @Override
    public void reasonDetail() {
        System.out.println("게임 컨텐츠를 선호하는 이유는 그래픽과 구성이라고 합니다.");
    }

    @Override
    public void favoriteDetail() {
        System.out.println("선호하는 게임에는 배틀그라운드, 크로스파이어가 뽑혔습니다.");
    }
}
