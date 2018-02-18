package sml.instructions

import sml.Instruction
import sml.Machine

/**
 * Describes the SML BNZ instruction
 *
 */
class BnzInstruction(label: String, val s1: Int, val L2: String): Instruction(label, "bnz") {
    override fun execute(m: Machine) {
        if(m.registers.getRegister(s1) != 0){
            m.pc = L2.substring(1).toInt()
        }
    }
}