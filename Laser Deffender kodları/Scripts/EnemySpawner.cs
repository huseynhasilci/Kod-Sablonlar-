using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class EnemySpawner : MonoBehaviour
{

    [SerializeField] List<WaveConfig> waveConfigs; // bir liste actik ve WaveConfigden aldik daha sonra onceden olusturdugumuz waveleri bu listenin icine atmis olduk
    [SerializeField] int startingWave = 0;
    [SerializeField] bool looping = false;
    // Start is called before the first frame update
    IEnumerator Start()
    {
        do
        {
            yield return StartCoroutine(SpawnAllWaves());
        }
        while (looping);
    }

    

    private IEnumerator SpawnAllWaves() // bu kod sayesinde sira sira butun waveleri calistirmis olduk
    {
        for (int waveIndex = startingWave;waveIndex < waveConfigs.Count; waveIndex++)
        {
            var currentWave = waveConfigs[waveIndex]; // hangi wave de olgununu aldik

            yield return StartCoroutine(SpawnAllEnemiesInWave(currentWave)); // daha sonra Enumator saeyesinde current wave uzerinden calistirdik


        }
    }

    private IEnumerator SpawnAllEnemiesInWave(WaveConfig waveConfig)
    {
        for (int enemyCount = 0; enemyCount < waveConfig.GetNumberOfEnemies(); enemyCount++)
        {
            var newEnemy = Instantiate(waveConfig.GetEnemyPrefab(), waveConfig.GetWayPoints()[0].transform.position, Quaternion.identity);

            newEnemy.GetComponent<EnemyPathing>().SetWaveConfig(waveConfig); // bunun sayesinde butun yeni dusmanlari cagirmamizi sagladi onceden olusturdugumuz Serialized fieldlari attik 

            yield return new WaitForSeconds(waveConfig.GetTimeBetweenSpawns());
        }
        

    }


}
