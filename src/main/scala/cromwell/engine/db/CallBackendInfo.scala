package cromwell.engine.db

sealed trait CallBackendInfo {
  val status: CallStatus
}

final case class LocalCallBackendInfo(status: CallStatus, processId: Option[Int], resultCode: Option[Int]) extends CallBackendInfo

final case class JesCallBackendInfo(status: CallStatus, jesId: JesId, jesStatus: JesStatus) extends CallBackendInfo