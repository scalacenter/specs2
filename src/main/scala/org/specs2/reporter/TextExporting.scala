package org.specs2
package reporter

import io.Output
import main.Arguments
import specification._

/**
 * This trait prints the executed fragments results and statistics
 * at the end of the specification
 */
private[specs2]
trait TextExporting extends TextPrinter with Exporting { outer =>

  type ExportType = Unit
  
  def export(klass: Class[_])(implicit args: Arguments) = (fragments: Seq[ExecutedFragment]) => {
    print(klass, fragments)
  }
} 
