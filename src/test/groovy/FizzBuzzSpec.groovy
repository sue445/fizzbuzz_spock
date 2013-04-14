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
        def actual = sut.result()

        then:
        actual == "Fizz"
    }
}
