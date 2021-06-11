package me.codeislet.springboot.example.sse

import com.sun.management.OperatingSystemMXBean
import org.springframework.stereotype.Service
import java.lang.management.ManagementFactory
import java.time.LocalDateTime


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Service
class ServerResourceService {

    private val osMXBean: OperatingSystemMXBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean::class.java)

    fun getResource(): ServerResource {
        return ServerResource(osMXBean.processCpuLoad, osMXBean.totalMemorySize, osMXBean.freeMemorySize, LocalDateTime.now())
    }
}