package xyz.blink.jetbrainext

import com.intellij.openapi.fileTypes.FileType
import com.intellij.openapi.fileTypes.FileTypeFactory
import com.intellij.util.PairConsumer

class BlinkFileTypeFactory : FileTypeFactory() {
    override fun createFileTypes(consumer: PairConsumer<FileType, String>) {
        consumer.consume(BlinkFileType)
    }
}