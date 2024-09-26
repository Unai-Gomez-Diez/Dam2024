package edu.unaigomdie.dan2024.features.movies.presentation

import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import edu.unaigomdie.dan2024.R
import edu.unaigomdie.dan2024.features.movies.data.MovieDataRepository
import edu.unaigomdie.dan2024.features.movies.data.local.MovieXmlLocalDataSource
import edu.unaigomdie.dan2024.features.movies.data.remote.MovieMockRemoteDataSource
import edu.unaigomdie.dan2024.features.movies.domain.GetMoviesUseCase
import edu.unaigomdie.dan2024.features.movies.domain.Movie
import edu.unaigomdie.dan2024.features.movies.domain.MovieRepository

class MovieActivity : AppCompatActivity() {

    private val movieFactory: MovieFactory = MovieFactory()
    private val viewModel = movieFactory.buildViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val movies = viewModel.viewCreated()
        bindData(movies)
        val movie = viewModel.itemSelected(movies.first().id)
        testXml()
        movie?.let {
            // Log.d("@dev", movie.toString())
        }


    }

    private fun testXml() {
        val xmlDataSource = MovieXmlLocalDataSource(this)
        val movie = viewModel.itemSelected("1")
        movie?.let {
            xmlDataSource.save(movie)
        }
        val movieSaved = xmlDataSource.findMovie()
        Log.d("@dev", movieSaved.toString())
    }

    private fun bindData(movies: List<Movie>) {
        findViewById<TextView>(R.id.movie_id_1).text = movies[0].id
        findViewById<TextView>(R.id.movie_title_1).text = movies[0].title
        findViewById<LinearLayout>(R.id.layout_1).setOnClickListener {
            val movie1: Movie? = viewModel.itemSelected(movies[0].id)
            movie1?.let {
                Log.d("@dev", "Pelicula seleccionada: ${it.title}")
            }
        }

        findViewById<TextView>(R.id.movie_id_2).text = movies[1].id
        findViewById<TextView>(R.id.movie_title_2).text = movies[1].title
        findViewById<LinearLayout>(R.id.layout_2).setOnClickListener {
            val movie2: Movie? = viewModel.itemSelected(movies[1].id)
            movie2?.let {
                Log.d("@dev", "Pelicula seleccionada: ${it.title}")
            }
        }

        findViewById<TextView>(R.id.movie_id_3).text = movies[2].id
        findViewById<TextView>(R.id.movie_title_3).text = movies[2].title
        findViewById<LinearLayout>(R.id.layout_3).setOnClickListener {
            val movie3: Movie? = viewModel.itemSelected(movies[2].id)
            movie3?.let {
                Log.d("@dev", "Pelicula seleccionada: ${it.title}")
            }
        }
        findViewById<TextView>(R.id.movie_id_4).text = movies[3].id
        findViewById<TextView>(R.id.movie_title_4).text = movies[3].title
        findViewById<LinearLayout>(R.id.layout_4).setOnClickListener {
            val movie4: Movie? = viewModel.itemSelected(movies[3].id)
            movie4?.let {
                Log.d("@dev", "Pelicula seleccionada: ${it.title}")
            }
        }
    }

    override fun onStart() {
        super.onStart()

    }

    override fun onResume() {
        super.onResume()

    }

    override fun onPause() {
        super.onPause()

    }

    override fun onStop() {
        super.onStop()

    }

    override fun onDestroy() {
        super.onDestroy()

    }
}