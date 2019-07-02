package moment

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait Moment extends js.Object {
  def apply(): Date = js.native

  /* Long has different semantics than JavaScript's numbers, therefore Double
   * must be used.
   */
  def apply(millis: Double): Date = js.native

  def apply(moment: Date): Date = js.native
  def apply(date: js.Date): Date = js.native
  def apply(string: String): Date = js.native
  def apply(string: String, format: String): Date = js.native
  def apply(string: String, format: String, locale: String): Date = js.native
  def apply(string: String, format: String, strict: Boolean): Date = js.native
  def apply(string: String, format: String, locale: String, strict: Boolean): Date = js.native
  def apply(opts: js.Any): Date = js.native

  def utc(): Date = js.native

  /* Long has different semantics than JavaScript's numbers, therefore Double
   * must be used.
   */
  def utc(millis: Double): Date = js.native

  def utc(arr: js.Array[Int]): Date = js.native
  def utc(string: String): Date = js.native
  def utc(string: String, format: String): Date = js.native
  def utc(string: String, formats: js.Array[String]): Date = js.native
  def utc(string: String, format: String, locale: String): Date = js.native
  def utc(moment: Date): Date = js.native
  def utc(date: js.Date): Date = js.native

  def locale(s: String): Unit = js.native

  def duration(millis: Int): Duration = js.native
  def duration(time: Int, unit: String): Duration = js.native
  def duration(time: String): Duration = js.native

  def weekdaysShort(): js.Array[String] = js.native
  def weekdaysShort(index: Int): String = js.native

  def tz(millis: Double, zone: String): Date = js.native
  def tz(arr: js.Array[Int], zone: String): Date = js.native
  def tz(moment: Date, zone: String): Date = js.native
  def tz(date: js.Date, zone: String): Date = js.native
  def tz(string: String, zone: String): Date = js.native
  def tz(string: String, format: String, zone: String): Date = js.native
  def tz(string: String, format: String, locale: String, zone: String): Date = js.native
  def tz(string: String, format: String, strict: Boolean, zone: String): Date = js.native
  def tz(string: String, format: String, locale: String, strict: Boolean, zone: String): Date = js.native

  def tz: Timezone = js.native

  def isDate(): Boolean = js.native

  /* Check if a variable is a native js Date object */
  def isDate(moment: js.Date): Boolean = js.native

}

@JSImport("moment-timezone", JSImport.Namespace, "moment")
@js.native
object Moment extends Moment

