class songD implements ContentDetails {
    //3-상세정보 음악
    @Override
    public void percentDetail() {
        System.out.println("음악 컨텐츠의 1년 내내 이용률은 89.1% 입니다.");
    }

    @Override
    public void countryDetail() {
        System.out.println("음악 컨텐츠의 호감도가 높은 국가는 인도, 태국, 인도네시아가 있습니다.");
    }

    @Override
    public void reasonDetail() {
        System.out.println("음악 컨텐츠를 선호하는 이유는 리듬, 가수와 퍼포먼스라고 합니다.");
    }

    @Override
    public void favoriteDetail() {
        System.out.println("선호하는 가수에는 BTS, 블랙핑크가 뽑혔으며, 주로 사용하는 플랫폼은 유튜브와 스포티파이입니다.");
    }
}
