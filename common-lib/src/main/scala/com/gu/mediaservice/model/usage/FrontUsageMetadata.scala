package com.gu.mediaservice.model

import play.api.libs.json._


case class FrontUsageMetadata(frontId: String, addedBy: String, collectionName: String) {

  def toMap = Map(
    "frontId" -> frontId,
    "addedBy" -> addedBy,
    "collectionName" -> collectionName
  )
}
object FrontUsageMetadata {
  implicit val reads: Reads[FrontUsageMetadata] = Json.reads[FrontUsageMetadata]
  implicit val writes: Writes[FrontUsageMetadata] = Json.writes[FrontUsageMetadata]
}
