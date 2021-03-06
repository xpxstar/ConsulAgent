/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.ac.iscas.cloudapp.agent.transaction;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum PropagationResultCode implements org.apache.thrift.TEnum {
  ROLLBACK(0),
  COMMIT(1),
  SYSTEM_FAILED(2),
  HEUR_HAZARD(3),
  HEUR_MIXED(4),
  HEUR_COMMIT(5),
  HEUR_ROLLBACK(6),
  EVENT_ACK(7),
  EVENT_FAILED(8);

  private final int value;

  private PropagationResultCode(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static PropagationResultCode findByValue(int value) { 
    switch (value) {
      case 0:
        return ROLLBACK;
      case 1:
        return COMMIT;
      case 2:
        return SYSTEM_FAILED;
      case 3:
        return HEUR_HAZARD;
      case 4:
        return HEUR_MIXED;
      case 5:
        return HEUR_COMMIT;
      case 6:
        return HEUR_ROLLBACK;
      case 7:
        return EVENT_ACK;
      case 8:
        return EVENT_FAILED;
      default:
        return null;
    }
  }
}
