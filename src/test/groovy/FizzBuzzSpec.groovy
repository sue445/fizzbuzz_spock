import spock.lang.Specification

/**
 * Created with IntelliJ IDEA.
 * User: sue445
 * Date: 2013/04/14
 * Time: 15:41
 * To change this template use File | Settings | File Templates.
 */
class FizzBuzzSpec extends Specification{
    def "3の倍数の時にFizzが返ってくること"(){
        setup:
        def sut = new FizzBuzz()

        when:
        def actual = sut.result(3)

        then:
        actual == "Fizz"
    }

    def "5の倍数の時にBuzzが返ってくること"(){
        setup:
        def sut = new FizzBuzz()

        when:
        def actual = sut.result(5)

        then:
        actual == "Buzz"
    }

    def "15の倍数の時にFizzBuzzが返ってくること"(){
        setup:
        def sut = new FizzBuzz()

        when:
        def actual = sut.result(15)

        then:
        actual == "FizzBuzz"
    }

    def "3の倍数でも5の倍数でもない時に入力値が返ってくること"(){
        setup:
        def sut = new FizzBuzz()

        when:
        def actual = sut.result(1)

        then:
        actual == "1"
    }

    def "FizzBuzz.result(#num) == #expected"(){
        setup:
        def sut = new FizzBuzz()

        expect:
        sut.result(num) == expected

        where:
        num | expected
         1  | "1"
         2  | "2"
         3  | "Fizz"
         4  | "4"
         5  | "Buzz"
         6  | "Fizz"
         7  | "7"
         8  | "8"
         9  | "Fizz"
        10  | "Buzz"
        11  | "11"
        12  | "Fizz"
        13  | "13"
        14  | "14"
        15  | "FizzBuzz"
    }
}
