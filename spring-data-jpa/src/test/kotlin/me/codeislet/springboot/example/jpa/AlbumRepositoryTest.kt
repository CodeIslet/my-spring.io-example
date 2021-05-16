package me.codeislet.springboot.example.jpa

import me.codeislet.springboot.example.jpa.album.Album
import me.codeislet.springboot.example.jpa.album.AlbumRepository
import me.codeislet.springboot.example.jpa.photo.Photo
import me.codeislet.springboot.example.jpa.photo.PhotoRepository
import me.codeislet.springboot.example.jpa.user.User
import me.codeislet.springboot.example.jpa.user.UserRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.TestConstructor


/**
 * @author Code Islet
 * @since 0.1.0
 */
@DataJpaTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class AlbumRepositoryTest(val userRepository: UserRepository,
                          val albumRepository: AlbumRepository,
                          val photoRepository: PhotoRepository
) {

    @Test
    fun `album repository tests`() {

        val user = userRepository.save(User("James", 1980))

        val photo1 = photoRepository.save(Photo("korea", 212311L, "image_1.png"))
        val photo2 = photoRepository.save(Photo("aus", 112511L, "image_2.png"))

        var album = Album(user)
        album.addPhoto(photo1)
        album.addPhoto(photo2)

        album = albumRepository.save(album)
        assertEquals(2, album.photos.size)

        val photo3 = photoRepository.save(Photo("nz", 5512111L, "image_3.png"))
        album.addPhoto(photo3)
        album = albumRepository.save(album)
        assertEquals(3, album.photos.size)
    }
}