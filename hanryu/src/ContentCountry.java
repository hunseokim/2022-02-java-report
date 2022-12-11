enum ContentCountry {
    //4. 컨텐츠 주요 소비국가 열거형
    드라마("말레이시아, 인도네시아, 태국"),
    영화("UAE, 태국, 인도네시아"),
    음악("베트남, UAE, 인도네시아"),
    게임("인도, 베트남, 태국");

    private String countryName;

    ContentCountry(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}
