// Code generated by Wire protocol buffer compiler, do not edit.
package misk.web.metadata.protos

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.hashCode
import kotlin.jvm.JvmField
import okio.ByteString

public class Robot(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  @JvmField
  public val robot_id: Int? = null,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  public val robot_token: String? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<Robot, Robot.Builder>(ADAPTER, unknownFields) {
  public override fun newBuilder(): Builder {
    val builder = Builder()
    builder.robot_id = robot_id
    builder.robot_token = robot_token
    builder.addUnknownFields(unknownFields)
    return builder
  }

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is Robot) return false
    if (unknownFields != other.unknownFields) return false
    if (robot_id != other.robot_id) return false
    if (robot_token != other.robot_token) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + robot_id.hashCode()
      result = result * 37 + robot_token.hashCode()
      super.hashCode = result
    }
    return result
  }

  public override fun toString(): String {
    val result = mutableListOf<String>()
    if (robot_id != null) result += """robot_id=$robot_id"""
    if (robot_token != null) result += """robot_token=${sanitize(robot_token)}"""
    return result.joinToString(prefix = "Robot{", separator = ", ", postfix = "}")
  }

  public fun copy(
    robot_id: Int? = this.robot_id,
    robot_token: String? = this.robot_token,
    unknownFields: ByteString = this.unknownFields
  ): Robot = Robot(robot_id, robot_token, unknownFields)

  public class Builder : Message.Builder<Robot, Builder>() {
    @JvmField
    public var robot_id: Int? = null

    @JvmField
    public var robot_token: String? = null

    public fun robot_id(robot_id: Int?): Builder {
      this.robot_id = robot_id
      return this
    }

    public fun robot_token(robot_token: String?): Builder {
      this.robot_token = robot_token
      return this
    }

    public override fun build(): Robot = Robot(
      robot_id = robot_id,
      robot_token = robot_token,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<Robot> = object : ProtoAdapter<Robot>(
      FieldEncoding.LENGTH_DELIMITED,
      Robot::class,
      "type.googleapis.com/squareup.cash.prospector.data.Robot",
      PROTO_2,
      null
    ) {
      public override fun encodedSize(value: Robot): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.INT32.encodedSizeWithTag(1, value.robot_id)
        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.robot_token)
        return size
      }

      public override fun encode(writer: ProtoWriter, value: Robot) {
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.robot_id)
        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.robot_token)
        writer.writeBytes(value.unknownFields)
      }

      public override fun decode(reader: ProtoReader): Robot {
        var robot_id: Int? = null
        var robot_token: String? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> robot_id = ProtoAdapter.INT32.decode(reader)
            2 -> robot_token = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return Robot(
          robot_id = robot_id,
          robot_token = robot_token,
          unknownFields = unknownFields
        )
      }

      public override fun redact(value: Robot): Robot = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}