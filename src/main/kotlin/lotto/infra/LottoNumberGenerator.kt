package lotto.infra

import lotto.domain.Lottery
import lotto.infra.port.NumberGenerator

class LottoNumberGenerator : NumberGenerator<List<Int>> {

    override fun generate(): List<Int> =
        Lottery_NUMBER_RANGE.shuffled().take(Lottery.LOTTO_NUMBER_LENGTH)

    companion object {

        private val Lottery_NUMBER_RANGE = (Lottery.MIN_LOTTO_NUMBER..Lottery.MAX_LOTTO_NUMBER)
    }
}