// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.source_context



/** `SourceContext` represents information about the source of a
  * protobuf element, like the file in which it is defined.
  *
  * @param fileName
  *   The path-qualified name of the .proto file that contained the associated
  *   protobuf element.  For example: `"google/protobuf/source_context.proto"`.
  */
@SerialVersionUID(0L)
final case class SourceContext(
    fileName: String = ""
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[SourceContext] with com.trueaccord.lenses.Updatable[SourceContext] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (fileName != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, fileName) }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = fileName
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.source_context.SourceContext = {
      var __fileName = this.fileName
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __fileName = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.source_context.SourceContext(
          fileName = __fileName
      )
    }
    def withFileName(__v: String): SourceContext = copy(fileName = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = fileName
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(fileName)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.source_context.SourceContext
}

object SourceContext extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.source_context.SourceContext] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.source_context.SourceContext, com.google.protobuf.SourceContext] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.source_context.SourceContext] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.source_context.SourceContext, com.google.protobuf.SourceContext] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.source_context.SourceContext): com.google.protobuf.SourceContext = {
    val javaPbOut = com.google.protobuf.SourceContext.newBuilder
    javaPbOut.setFileName(scalaPbSource.fileName)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.SourceContext): com.google.protobuf.source_context.SourceContext = com.google.protobuf.source_context.SourceContext(
    fileName = javaPbSource.getFileName
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.source_context.SourceContext = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.source_context.SourceContext(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.source_context.SourceContext] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.source_context.SourceContext(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = SourceContextProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = SourceContextProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.source_context.SourceContext(
  )
  implicit class SourceContextLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.source_context.SourceContext]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.source_context.SourceContext](_l) {
    def fileName: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.fileName)((c_, f_) => c_.copy(fileName = f_))
  }
  final val FILE_NAME_FIELD_NUMBER = 1
}
