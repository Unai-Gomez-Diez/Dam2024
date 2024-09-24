package edu.unaigomdie.dan2024.features.movies.domain

class GetMovieUseCase(private val movieRepository: MovieRepository) {
    operator fun invoke(id: String): Movie? {
        return movieRepository.getMovie(id)
    }
}