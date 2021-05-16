package me.codeislet.springboot.example.cloud.aws

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor
import java.time.LocalDateTime


/**
 * @author Code Islet
 * @since 0.1.0
 */
@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class ServerStatusServiceTest(val serverStatusService: ServerStatusService) {

    @Test
    fun `object CRUD test`() {
        val serverName = "API"
        val updatedAt = LocalDateTime.now()

        val serverStatus = ServerStatus(serverName, Status.ACTIVE, updatedAt)
        serverStatusService.setServerStatus(serverStatus)

        val savedStatus = serverStatusService.getServerStatus(serverName)
        assertNotNull(savedStatus)
        assertEquals(serverName, savedStatus!!.name)
        assertEquals(Status.ACTIVE, savedStatus.status)
        assertEquals(updatedAt, savedStatus.updateAt)

        serverStatusService.deleteServerStatus(serverName)

        val deletedStatus = serverStatusService.getServerStatus(serverName)
        assertNull(deletedStatus)
    }
}