// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package caseStudy4.protobuf.WeeklySalesData

object WeeklySalesDataProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq.empty
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      caseStudy4.protobuf.WeeklySalesData.WeeklySalesData
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """ChVXZWVrbHlTYWxlc0RhdGEucHJvdG8SE2Nhc2VTdHVkeTQucHJvdG9idWYi5wEKD1dlZWtseVNhbGVzRGF0YRIgCgVzdG9yZ
  RgBIAEoBUIK4j8HEgVzdG9yZVIFc3RvcmUSLwoKZGVwYXJ0bWVudBgCIAEoBUIP4j8MEgpkZXBhcnRtZW50UgpkZXBhcnRtZW50E
  h0KBGRhdGUYAyABKAlCCeI/BhIEZGF0ZVIEZGF0ZRIzCgx3ZWVrbHlfc2FsZXMYBCABKAJCEOI/DRILd2Vla2x5U2FsZXNSC3dlZ
  WtseVNhbGVzEi0KCmlzX2hvbGlkYXkYBSABKAlCDuI/CxIJaXNIb2xpZGF5Uglpc0hvbGlkYXliBnByb3RvMw=="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}