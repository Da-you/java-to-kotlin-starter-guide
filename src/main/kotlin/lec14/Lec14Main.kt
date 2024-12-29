package lec14

/**
 * 코틀린의 다양한 클래스
 * Data class 계층간의 데이터 전달을 위한 클래스
 * Enum class
 * Sealed class, Sealed interface
 */
data class PersonDto(
    // 자동으로 equals, hashcode, getter, toString 생성 + 추가로 named argument 사용시 builder 효과도 볼수있음
    val name: String,
    val age: Int

)
fun handleCountry(country: Country){
    when(country){
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

enum class Country(
    private val code: String
){
    // when 과 사용시 더욱더 진가를 발휘(enum 에 변경이 생기면 알림을 주며, 별도의 else 문 처리가 필요 없다.)
    KOREA("KO"),
    AMERICA("US")
}

sealed class HyundaiCar(
    // 상속이 가능한 추상클래스를 만들고싶으나 외부에서 이 클래스를 상속받는것을 막고싶을경우(하위클래스를 봉인)
    val name: String,
    val price: Double,
)