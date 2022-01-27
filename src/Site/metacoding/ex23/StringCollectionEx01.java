package Site.metacoding.ex23;

public class StringCollectionEx01 {

    public static void main(String[] args) {

        // String과 StrigBuffer를 비교
        // 문자열을 차곡차곡 정렬할 때 StirngBuffer가 좋다. 이유) 가독성이 젛다 2) 매모리공간을 효율적으로 사용할 수 있다
        // StringPool
        // Stirng bulider 와 buffer의 차이 - 동기화여부
        // String builder 는 동기화를 하지 않는다. 즉 같은 자원을 사용해서 데이터를 해친다.
        // String buffer는 동기화를 한다. 즉 한명씩 그 데이터를 사용한다.
        // 동기화: 순서를 정한다 ex) 화장실 사용 - Builder 화장실 한칸 같이 쓰기 , -Buffer 화장실 한칸 한명쓰고 나오면
        // 다음사람이 씀

        StringBuffer sb = new StringBuffer();
        sb.append("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?");
        sb.append(
                "serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&");
        sb.append("numOfRows=10&");
        sb.append("pageNo=1&");
        sb.append("dataType=JSON&");
        sb.append("base_date=20220126&");
        sb.append("base_time=1700&");
        sb.append("nx=97&");
        sb.append("ny=75");

        System.out.println(sb.toString());
    }
}
