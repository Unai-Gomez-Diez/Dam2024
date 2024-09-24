package edu.unaigomdie.dan2024.features.movies.presentation

import androidx.lifecycle.ViewModel
import edu.unaigomdie.dan2024.features.movies.domain.GetMovieUseCase
import edu.unaigomdie.dan2024.features.movies.domain.GetMoviesUseCase
import edu.unaigomdie.dan2024.features.movies.domain.Movie

class MovieViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val getMovieUseCase: GetMovieUseCase
) : ViewModel() {

    fun viewCreated(): List<Movie> {
        return getMoviesUseCase.invoke()

    }

    fun itemSelected(id: String): Movie? {
        return getMovieUseCase.invoke(id)
    }

}